package com.yugioh.game.controller;

import com.yugioh.game.model.DuelResult;
import com.yugioh.game.model.Player;
import com.yugioh.game.repository.UserRepository;
import com.yugioh.game.service.DuelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duel")
public class DuelController {

    private final UserRepository userRepository = new UserRepository();
    private final DuelService duelService = new DuelService();

    @GetMapping
    public DuelResult duel() {
        Player p1 = userRepository.findByUsername("yugi");
        Player p2 = userRepository.findByUsername("kaiba");
        return duelService.duel(p1, p2);
    }
}
