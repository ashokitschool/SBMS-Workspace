package in.ashokit.exception;

import java.time.LocalDate;

public class ExInfo {

	private String exCode;
	private String exDesc;
	private LocalDate exDate;

	public ExInfo(String exCode, String exDesc, LocalDate exDate) {
		super();
		this.exCode = exCode;
		this.exDesc = exDesc;
		this.exDate = exDate;
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExDesc() {
		return exDesc;
	}

	public void setExDesc(String exDesc) {
		this.exDesc = exDesc;
	}

	public LocalDate getExDate() {
		return exDate;
	}

	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	
}
