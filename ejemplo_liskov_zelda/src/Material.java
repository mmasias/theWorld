public class Material {
    private int _bonusDaño;
    private String _nombreMaterial;
    public Material(String nombreMaterial, int bonusDaño) {
        this._nombreMaterial = nombreMaterial;
        this._bonusDaño = bonusDaño;
    }
    public int getBonusDaño() {
        return this._bonusDaño;
    }
    public String getNombreMaterial() {
        return this._nombreMaterial;
    }
}