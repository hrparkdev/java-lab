package generics;

public class TreeDPrinter<T> extends Material{
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}

	@Override
	public void doPrinting() {
		System.out.println("재료로 출력합니다.");
	}
	
}
