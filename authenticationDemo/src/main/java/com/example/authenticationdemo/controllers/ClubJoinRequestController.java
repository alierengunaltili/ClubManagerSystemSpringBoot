package com.example.authenticationdemo.controllers;

import com.example.authenticationdemo.repositories.ClubRepository;
import com.example.authenticationdemo.repositories.UserRepository;
import com.example.authenticationdemo.dto.ClubJoinRequest;
import com.example.authenticationdemo.models.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ClubJoinRequestController {
    /*@Autowired
    private ClubRepository clubRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/joinClub")
    public Club joinToClub(@RequestBody ClubJoinRequest request){
        return clubRepository.save(request.getClub());
    }

    @GetMapping("/findAllOrders")
    public List<Club> findAllClubMembers(){
        return clubRepository.findAll();
    }*/
}
