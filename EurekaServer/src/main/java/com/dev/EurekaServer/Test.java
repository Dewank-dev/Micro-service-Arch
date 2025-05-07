package com.dev.EurekaServer;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@Validated
public class Test {

//    private JwtService jwtService;

    public static void main(String[] args) {
        String s =" i love indiae3 doyoux?";

        String list = Arrays.stream(s.split("")).filter(e -> e.trim() != "" &&
                Collections.frequency(Arrays.stream(s.split("")).toList(), e) > 1
        ).findAny().get();


        System.out.println(list);

    }


}

class Player{
    String name;
    List<Integer> runs;
    String team;

    public Player(String name, List<Integer> runs, String team) {
        this.name = name;
        this.runs = runs;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                ", team='" + team + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRuns() {
        return runs;
    }

    public void setRuns(List<Integer> runs) {
        this.runs = runs;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}


