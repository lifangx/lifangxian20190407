package com.example.www.lifangxian20190407.bb;

public class Results {
    private Mlss mlss;
    private Pzsh pzsh;
    private Rxxp rxxp;

    public Results(Mlss mlss, Pzsh pzsh, Rxxp rxxp) {
        this.mlss = mlss;
        this.pzsh = pzsh;
        this.rxxp = rxxp;
    }

    public Mlss getMlss() {
        return mlss;
    }

    public void setMlss(Mlss mlss) {
        this.mlss = mlss;
    }

    public Pzsh getPzsh() {
        return pzsh;
    }

    public void setPzsh(Pzsh pzsh) {
        this.pzsh = pzsh;
    }

    public Rxxp getRxxp() {
        return rxxp;
    }

    public void setRxxp(Rxxp rxxp) {
        this.rxxp = rxxp;
    }

    @Override
    public String toString() {
        return "Results{" +
                "mlss=" + mlss +
                ", pzsh=" + pzsh +
                ", rxxp=" + rxxp +
                '}';
    }

}
