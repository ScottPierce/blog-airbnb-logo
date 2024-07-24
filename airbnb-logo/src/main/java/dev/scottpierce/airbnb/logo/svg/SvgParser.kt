package dev.scottpierce.airbnb.logo.svg

import dev.scottpierce.airbnb.logo.Point

object SvgParser {
    /**
     * Parses an SVG path string into non-relative SVG paths
     */
    fun parseSvgPathData(pathData: String): List<SvgPathCommand> {
        val commands = mutableListOf<SvgPathCommand>()
        val regex = """([a-zA-Z])|(-?\d*\.?\d+)""".toRegex()
        val matches = regex.findAll(pathData).toList()
        var i = 0

        var lastCommand: Char? = null
        var currentX = 0f
        var currentY = 0f

        fun nextFloat(): Float {
            if (i >= matches.size) {
                throw SvgParseException("Unexpected end of path data")
            }
            return matches[i++].value.toFloat()
        }

        while (i < matches.size) {
            val match = matches[i++]
            val commandString = match.value
            val command: Char

            if (commandString.length == 1 && commandString[0].isLetter()) {
                command = commandString[0]
            } else if (lastCommand != null) {
                i--
                command = lastCommand
            } else {
                throw SvgParseException("Expected a command, but found '$commandString'. Last Command: $lastCommand")
            }

            val relative = command.isLowerCase()

            when (command.uppercaseChar()) {
                'L' -> {
                    val x = nextFloat()
                    val y = nextFloat()
                    if (relative) {
                        currentX += x
                        currentY += y
                    } else {
                        currentX = x
                        currentY = y
                    }
                    commands.add(SvgPathCommand.LineTo(Point(currentX, currentY)))
                }
                'C' -> {
                    val x1 = nextFloat() + if (relative) currentX else 0f
                    val y1 = nextFloat() + if (relative) currentY else 0f
                    val x2 = nextFloat() + if (relative) currentX else 0f
                    val y2 = nextFloat() + if (relative) currentY else 0f
                    val x = nextFloat() + if (relative) currentX else 0f
                    val y = nextFloat() + if (relative) currentY else 0f
                    currentX = x
                    currentY = y
                    commands.add(SvgPathCommand.CurveTo(Point(x1, y1), Point(x2, y2), Point(currentX, currentY)))
                }
                'S' -> {
                    val x2 = nextFloat() + if (relative) currentX else 0f
                    val y2 = nextFloat() + if (relative) currentY else 0f
                    val x = nextFloat() + if (relative) currentX else 0f
                    val y = nextFloat() + if (relative) currentY else 0f

                    currentX = x
                    currentY = y
                    commands.add(SvgPathCommand.SmoothCurveTo(Point(x2, y2), Point(currentX, currentY)))
                }
                else -> throw SvgParseException("Unknown command: $command")
            }

            lastCommand = command
        }

        return commands
    }
}

class SvgParseException(message: String) : RuntimeException(message)
