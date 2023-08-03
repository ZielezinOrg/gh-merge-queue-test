/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package gh.merge.queue.test.utilities

import gh.merge.queue.test.list.LinkedList

class JoinUtils {
    companion object {
        fun join(source: LinkedList): String {
            val result = StringBuilder()
            for (i in 0 until source.size()) {
                if (result.isNotEmpty()) {
                    result.append(" ")
                }
                result.append(source.get(i))
            }

            return result.toString()
        }
    }
}
