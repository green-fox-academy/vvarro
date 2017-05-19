package com.greenfoxacademy.iamgroot.controller;

import com.greenfoxacademy.iamgroot.model.CargoStatus;
import com.greenfoxacademy.iamgroot.model.GrootMessage;
import com.greenfoxacademy.iamgroot.model.PlayList;
import com.greenfoxacademy.iamgroot.model.ShipCargoStatus;
import com.greenfoxacademy.iamgroot.model.Song;
import com.greenfoxacademy.iamgroot.repository.SongRepository;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  ShipCargoStatus shipCargoStatus;
  PlayList playList;
  SongRepository songRepository;

  public GuardianController(SongRepository songRepository) {
    this.songRepository = songRepository;
    this.playList = new PlayList();
    this.shipCargoStatus = new ShipCargoStatus();
  }

  @RequestMapping("/groot")
  public GrootMessage getGrootMessage(@RequestParam(value = "message") String received) {
    GrootMessage grootMessage = new GrootMessage(received);
    return grootMessage;
  }

  @RequestMapping("/rocket")
  public ShipCargoStatus getShipCargoStatus() {
    return shipCargoStatus;
  }

  @RequestMapping("/rocket/fill")
  public CargoStatus getCargoStatus(@RequestParam("caliber") String caliber,
      @RequestParam("amount") double amount) {
    CargoStatus cargoStatus = new CargoStatus(caliber, amount);
    shipCargoStatus.addCaliber(caliber, amount);
    shipCargoStatus
        .setShipstatus(shipCargoStatus.getShipstatusInt() + ((int) (amount * 100) / 12500));
    if ((shipCargoStatus.getShipstatus().equals("full")) || (shipCargoStatus.getShipstatus()
        .equals("overloaded"))) {
      shipCargoStatus.setReady(true);
    }
    cargoStatus.setReady(shipCargoStatus.isReady());
    cargoStatus.setShipstatus(shipCargoStatus.getShipstatus());
    return cargoStatus;
  }

  @RequestMapping("/awsome")
  public PlayList getAwsomeMix() {
    playList.setPlaylist(songRepository.findAll());
    return playList;
  }

  @PostMapping("/awsome")
  public PlayList addSong(@RequestBody Song song) {
    songRepository.save(song);
    playList.setPlaylist(songRepository.findAll());
    return playList;
  }

  @PutMapping("/{id}/upvote")
  public PlayList songUpvote(@PathVariable(value = "id", required = true) long id) {
    songRepository.findOne(id).upVote();
    songRepository.save(songRepository.findOne(id));
    playList.setPlaylist(songRepository.findAll());
    return playList;
  }

  @PutMapping("/{id}/downvote")
  public PlayList putPostDownVote(@PathVariable(value = "id", required = true) long id) {
    songRepository.findOne(id).downVote();
    songRepository.save(songRepository.findOne(id));
    playList.setPlaylist(songRepository.findAll());
    return playList;
  }

  @RequestMapping(value = "/awsome",  method = RequestMethod.DELETE)
  public PlayList deletePost(@RequestParam(value = "deleteid", required = true) long id) {
    songRepository.delete(songRepository.findOne(id));
    playList.setPlaylist(songRepository.findAll());
    return playList;
  }

  @RequestMapping("/awsome/listall")
  public PlayList listSongsByGenre(@RequestParam(value = "genre") String genre) {
    PlayList listGenre = new PlayList();
    listGenre.setPlaylist(songRepository.findAllByGenreContains(genre));
    return listGenre;
  }

  @RequestMapping("/awsome/listall")
  public PlayList listSongsByAuthor(@RequestParam(value = "author") String author) {
    PlayList listAuthor = new PlayList();
    listAuthor.setPlaylist(songRepository.findAllByAuthorContains(author));
    return listAuthor;
  }

  @RequestMapping("/awsome/listall")
  public PlayList listSongsByYear(@RequestParam(value = "year") String year) {
    PlayList listYear = new PlayList();
    listYear.setPlaylist(songRepository.findAllByYearIsContaining(year));
    return listYear;
  }

  @RequestMapping("/awsome/listfav")
  public PlayList favouriteSong() {
    PlayList listFav = new PlayList();
    listFav.setPlaylist(songRepository.findFirstByOrderByRatingDesc());
    return listFav;
  }

  @RequestMapping("/awsome/listfav3")
  public PlayList favouriteThreeSong() {
    PlayList listFav = new PlayList();
    listFav.setPlaylist(songRepository.findFirst3ByOrderByRatingDesc());
    return listFav;
  }

  @RequestMapping("/awsome/listfav5")
  public PlayList favouriteFiveSong() {
    PlayList listFav = new PlayList();
    listFav.setPlaylist(songRepository.findFirst5ByOrderByRatingDesc());
    return listFav;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public com.greenfoxacademy.iamgroot.controller.ExceptionController getError(
      MissingServletRequestParameterException ex) {
    return new com.greenfoxacademy.iamgroot.controller.ExceptionController(
        "I am Groot!");
  }

}
