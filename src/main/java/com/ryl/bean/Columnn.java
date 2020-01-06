package com.ryl.bean;

public class Columnn {
	
	
	private Integer id;
	private String ver;
	private String ms;
	private String cname;
	private String cp;
	private String home;
	private String tz;
	private String cr;
	private String nj;
	private String tb;
	private String bz;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public String getNj() {
		return nj;
	}
	public void setNj(String nj) {
		this.nj = nj;
	}
	public String getTb() {
		return tb;
	}
	public void setTb(String tb) {
		this.tb = tb;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public Columnn(Integer id, String ver, String ms, String cname, String cp, String home, String tz, String cr,
			String nj, String tb, String bz) {
		super();
		this.id = id;
		this.ver = ver;
		this.ms = ms;
		this.cname = cname;
		this.cp = cp;
		this.home = home;
		this.tz = tz;
		this.cr = cr;
		this.nj = nj;
		this.tb = tb;
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "Columnn [id=" + id + ", ver=" + ver + ", ms=" + ms + ", cname=" + cname + ", cp=" + cp + ", home="
				+ home + ", tz=" + tz + ", cr=" + cr + ", nj=" + nj + ", tb=" + tb + ", bz=" + bz + "]";
	}
	
	public Columnn() {
		// TODO Auto-generated constructor stub
	}
}
