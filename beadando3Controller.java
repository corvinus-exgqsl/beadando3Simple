package hu.beadando3.beadando3Simple;

import org.springframework.web.bind.annotation.*;

@RestController
public class beadando3Controller {
    private static final String template = "Hello, %s!";


    @PostMapping(path = "/megfordit")
    public Megfordit reverseList(@RequestBody String string) {
        return new MegforditService().reverser(string);
    }

    @GetMapping("/harmadik")
    public Udvozol greeting(@RequestParam(value = "name", defaultValue = "Felhasznalo") String name) {
        return new Udvozol(String.format(template, name));
    }
}
