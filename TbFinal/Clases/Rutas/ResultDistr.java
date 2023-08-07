package Clases.Rutas;

import java.util.Arrays;

import Clases.Almacen;

public class ResultDistr {
    private Almacen[] result;

    public ResultDistr(Almacen[] result) {
        this.result = result;
    }

    public Almacen[] getResult() {
        return result;
    }

    public void setResult(Almacen[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.result);
    }
}
