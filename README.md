# Reproducer for ignore list `Step Into` for Chrome DevTools

1. Run the `./gradlew wasmJsBrowserDevelopmentRun` (for wasm) or `./gradlew jsBrowserDevelopmentRun` (for js) and open `http://localhost:8080/`
2. Inside the Chrome DevTools add pattern `IgnoredFile.kt` to the "Ignored List" (Settings -> Ignore List -> Add Pattern...)
3. Inside the Chrome DevTools put a breakpoint on the line `12` in `Main.kt` file and after stop click `Step Into`
4. The debugger will go into the function that is placed inside the ignored file, and the call stack doesn't have this function call
