package com.promax.roofcalc
object RoofProMax {
    fun calc(span: Double, height: Double, snow: Double, wind: Double): String {
        val angle = Math.toDegrees(Math.atan(height / span))
        val rafter = Math.sqrt(span * span + height * height)
        return "Кут: %.2f°\nКроква: %.2f м".format(angle, rafter)
    }
}
