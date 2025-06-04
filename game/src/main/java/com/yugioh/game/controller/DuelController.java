package com.yugioh.game.controller;

import com.yugioh.game.model.DuelResult;
import com.yugioh.game.model.Player;
import com.yugioh.game.repository.PlayerRepository;
import com.yugioh.game.service.DuelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duel")
public class DuelController {

    private final PlayerRepository playerRepository;
    private final DuelService duelService;

    public DuelController(PlayerRepository playerRepository, DuelService duelService) {
        this.playerRepository = playerRepository;
        this.duelService = duelService;
    }

    @GetMapping
    public DuelResult duel() {
        Player p1 = playerRepository.findByUsername("yugi");
        Player p2 = playerRepository.findByUsername("kaiba");
        return duelService.duel(p1, p2);
    }
}
