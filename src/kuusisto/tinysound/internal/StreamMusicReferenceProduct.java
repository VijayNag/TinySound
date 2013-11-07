package kuusisto.tinysound.internal;


public class StreamMusicReferenceProduct {
	private byte[] buf;

	public byte[] getBuf() {
		return buf;
	}

	public void setBuf(byte[] buf) {
		this.buf = buf;
	}

	public int[] data(int[] data, boolean bigEndian) {
		if (bigEndian) {
			data[0] = ((this.buf[0] << 8) | (this.buf[1] & 0xFF));
			data[1] = ((this.buf[2] << 8) | (this.buf[3] & 0xFF));
		} else {
			data[0] = ((this.buf[1] << 8) | (this.buf[0] & 0xFF));
			data[1] = ((this.buf[3] << 8) | (this.buf[2] & 0xFF));
		}
		return data;
	}
}