package io.stackroute.clientservicerepresentation.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Arrays;
import java.util.Date;

@Document
public class ClientRepresentative {

//"id" : { type: uuid, unique: true, index: true },
//            "ticket_id" : { type: uuid, index: true },
//            "query": { type: String, Index: true }
//  "intent": { type: String[] }
//  "raisedBy": { typa: String, index: true }
//  "ticketRasiedOn": { type: Date }
//  "type": { type: ENUM, index: true }
//  "assignedAt": { type: Date, index: true }
//  "assignedTo": { type: String, index: true }
//  "feedback": { type: String }
//  "rating": { type: Number }
//  "commandUsed": { type: String }
//  "updatedBy": { type: String }
//  "updatedOn": { type: Date }

    @Id
    int id;
    int ticket_Id;
    String query;
    String type;
    String intend[];
    String raisedBy;
    Date ticketraisedOn;
    Date assignedAt;
    String assignedTo;
    String feedback;
    int rating;
    String commandUsed;
    String updatedBy;
    Date updatedOn;

    public ClientRepresentative() {
    }

    public ClientRepresentative(int id, int ticket_Id, String query, String type, String[] intend, String raisedBy, Date ticketraisedOn, Date assignedAt, String assignedTo, String feedback, int rating, String commandUsed, String updatedBy, Date updatedOn) {
        this.id = id;
        this.ticket_Id = ticket_Id;
        this.query = query;
        this.type = type;
        this.intend = intend;
        this.raisedBy = raisedBy;
        this.ticketraisedOn = ticketraisedOn;
        this.assignedAt = assignedAt;
        this.assignedTo = assignedTo;
        this.feedback = feedback;
        this.rating = rating;
        this.commandUsed = commandUsed;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicket_Id() {
        return ticket_Id;
    }

    public void setTicket_Id(int ticket_Id) {
        this.ticket_Id = ticket_Id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getIntend() {
        return intend;
    }

    public void setIntend(String[] intend) {
        this.intend = intend;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public Date getTicketraisedOn() {
        return ticketraisedOn;
    }

    public void setTicketraisedOn(Date ticketraisedOn) {
        this.ticketraisedOn = ticketraisedOn;
    }

    public Date getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCommandUsed() {
        return commandUsed;
    }

    public void setCommandUsed(String commandUsed) {
        this.commandUsed = commandUsed;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "ClientRepresentative{" +
                "id=" + id +
                ", ticket_Id=" + ticket_Id +
                ", query='" + query + '\'' +
                ", type='" + type + '\'' +
                ", intend=" + Arrays.toString(intend) +
                ", raisedBy='" + raisedBy + '\'' +
                ", ticketraisedOn=" + ticketraisedOn +
                ", assignedAt=" + assignedAt +
                ", assignedTo=" + assignedTo +
                ", feedback='" + feedback + '\'' +
                ", rating=" + rating +
                ", commandUsed='" + commandUsed + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
