package test.portone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@Controller
public class HomeController {

    @GetMapping("/payment")
    public Mono<Rendering> payment(){

        return Mono.just(Rendering.view("payment1").build());
    }
    @GetMapping("/payment2")
    public Mono<Rendering> payment2(){

        return Mono.just(Rendering.view("payment2").build());
    }
}
