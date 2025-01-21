package com.murilloaragao.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gamelist;

    public BelongingPK (){

    }

    public BelongingPK(Game game, GameList gamelist) {
        this.game = game;
        this.gamelist = gamelist;
    }

    public GameList getGamelist() {
        return gamelist;
    }

    public void setGamelist(GameList gamelist) {
        this.gamelist = gamelist;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(gamelist, that.gamelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gamelist);
    }
}
