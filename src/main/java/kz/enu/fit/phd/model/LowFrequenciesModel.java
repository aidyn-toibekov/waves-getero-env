package kz.enu.fit.phd.model;

public class LowFrequenciesModel {
    private double c1 = 1400;
    private double c2 = 330;
    private double kappa;
    private double tau = 0.001;
    private double k11 = 0.1;
    private double k22 = 0.5;
    private double k33 = 0.8;
    private double k1 = 0.5;
    private double k2;
    private double xiMin= 0;
    private double xiMax= 2;

    public LowFrequenciesModel() {
        evalKappa();
        evalK2();
    }

    private void evalK2() {
        this.k2 = 1 - this.k1;
    }

    private void evalKappa() {
        if (this.c2 != 0) {
            this.kappa = this.c1 / this.c2;
        } else {
            this.kappa = 0;
        }
    }

    public void setC1(double c1) {
        this.c1 = c1;
        evalKappa();
    }

    public void setC2(double c2) {
        this.c2 = c2;
        evalKappa();
    }

    public void setTau(double tau) {
        this.tau = tau;
    }

    public void setK1(double k1) {
        this.k1 = k1;
        evalK2();
    }

    public void setXiMin(double xiMin) {
        this.xiMin = xiMin;
    }

    public void setXiMax(double xiMax) {
        this.xiMax = xiMax;
    }

    public double getC1() {
        return c1;
    }

    public double getC2() {
        return c2;
    }

    public double getKappa() {
        return kappa;
    }

    public double getTau() {
        return tau;
    }

    public double getK1() {
        return k1;
    }

    public double getK2() {
        return k2;
    }

    public double getXiMin() {
        return xiMin;
    }

    public double getXiMax() {
        return xiMax;
    }

    public double getK11() {
        return k11;
    }

    public void setK11(double k11) {
        this.k11 = k11;
    }

    public double getK22() {
        return k22;
    }

    public void setK22(double k22) {
        this.k22 = k22;
    }

    public double getK33() {
        return k33;
    }

    public void setK33(double k33) {
        this.k33 = k33;
    }

    public double func(double xi, double k) {
        return Math.sqrt(-2 * (k * k * kappa * kappa * tau - k * k * kappa * kappa - k * k * tau * tau - 2 * k * kappa * kappa * tau + k * k * tau + k * kappa * kappa + k * tau * tau + kappa * kappa * tau) * tau * (Math.cos(xi) - 1)) / (k * k * kappa * kappa * tau - k * k * kappa * kappa - k * k * tau * tau - 2 * k * kappa * kappa * tau + k * k * tau + k * kappa * kappa + k * tau * tau + kappa * kappa * tau);
    }
}
