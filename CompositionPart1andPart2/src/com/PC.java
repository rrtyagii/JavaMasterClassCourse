package com;

public class PC {
	private Case theCase; 
	private Motherboard motherboard; 
	private Monitor monitor;
	public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
		super();
		this.theCase = theCase;
		this.motherboard = motherboard;
		this.monitor = monitor;
	}
	/**
	 * @return the theCase
	 */
	public Case getTheCase() {
		return theCase;
	}
	/**
	 * @return the motherboard
	 */
	public Motherboard getMotherboard() {
		return motherboard;
	}
	/**
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	} 
	 
	

}
