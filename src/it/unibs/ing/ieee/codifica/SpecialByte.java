package it.unibs.ing.ieee.codifica;

public class SpecialByte {
	private Character[] payload;
	
	public Character[] getPayload() {
		return payload;
	}

	public void setPayload(Character[] payload) {
		this.payload = payload;
	}

	public SpecialByte() {
		payload = new Character[8];
	}
	
	
}
