package in.ashokit.response;

import java.time.LocalDate;

public class Ticket {

	private Integer ticketNum;

	private String name;

	private String phno;

	private String gender;

	private String from;

	private String to;

	private Double price;

	private LocalDate doj;

	private String ticketStatus;

	private Integer trainNum;

	public Integer getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}

}
