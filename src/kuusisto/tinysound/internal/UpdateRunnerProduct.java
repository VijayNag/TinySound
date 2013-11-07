package kuusisto.tinysound.internal;


import java.util.concurrent.atomic.AtomicBoolean;

public class UpdateRunnerProduct {
	private AtomicBoolean running;

	public AtomicBoolean getRunning() {
		return running;
	}

	public void setRunning(AtomicBoolean running) {
		this.running = running;
	}

	/**
	 * Stop this UpdateRunner from updating the TinySound system.
	 */
	public void stop() {
		this.running.set(false);
	}
}