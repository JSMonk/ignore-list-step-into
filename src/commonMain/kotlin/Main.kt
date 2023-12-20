package org.example

import kotlinx.browser.document
import kotlinx.dom.appendElement
import kotlinx.dom.appendText

fun main() {
    // 1. Run the `./gradlew wasmJsBrowserDevelopmentRun` (for wasm) or `./gradlew jsBrowserDevelopmentRun` (for js) and open `http://localhost:8080/`
    // 2. Inside the Chrome DevTools add pattern `IgnoredFile.kt` to the "Ignored List" (Settings -> Ignore List -> Add Pattern...)
    // 3. Put a breakpoint on the next line and after stop click `Step Into`
    // 4. We are inside the ignored file and inside the function that is not on the Call Stack
    val test = ignoredFunction()
    document.body?.appendElement("h1") {
        appendText(test.toString())
    }
}