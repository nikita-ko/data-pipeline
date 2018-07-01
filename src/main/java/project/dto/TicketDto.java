package project.dto;

import lombok.Getter;
import lombok.Setter;
import project.model.Ticket;

import java.time.LocalDate;

@Getter @Setter
public class TicketDto {
    String game;
    LocalDate date;
    String city;
    String stadium;
    Double price;

    public TicketDto(Ticket ticket) {
        this.game = String.format("%s-%s", ticket.getGame().getFirstTeam(), ticket.getGame().getSecondTeam());
        this.date = ticket.getGame().getMatchDate();
        this.city = ticket.getGame().getStadium().getCity();
        this.stadium = ticket.getGame().getStadium().getName();
        this.price = ticket.getPrice();
    }
}
