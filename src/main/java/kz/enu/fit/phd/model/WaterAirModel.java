package kz.enu.fit.phd.model;

public class WaterAirModel {
    private double c1 = 1400;
    private double c2 = 330;
    private double kappa;
    private double tau = 0.001;
    private double k = 0.5;
    private double k1 = 0.5;
    private double k2;
    private double xi = Math.PI;
    private double lambdaMin= 1;
    private double lambdaMax= 10;

    public WaterAirModel() {
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

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
        evalKappa();
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
        evalKappa();
    }

    public double getKappa() {
        return kappa;
    }

    public double getTau() {
        return tau;
    }

    public void setTau(double tau) {
        this.tau = tau;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getK1() {
        return k1;
    }

    public void setK1(double k1) {
        this.k1 = k1;
        evalK2();
    }

    public double getK2() {
        return k2;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getLambdaMin() {
        return lambdaMin;
    }

    public void setLambdaMin(double lambdaMin) {
        this.lambdaMin = lambdaMin;
    }

    public double getLambdaMax() {
        return lambdaMax;
    }

    public void setLambdaMax(double lambdaMax) {
        this.lambdaMax = lambdaMax;
    }

    public double func(double lambda) {
        return (((-0.4e1 * tau * ((0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1))) * kappa * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) - 0.8e1 * (tau * kappa * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1) - 0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.5000000000e0 * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)) + 0.4e1 * (tau * kappa * ((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.1e1 * (0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) - 0.1e1 * (0.2e1 * tau * (0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1)) * kappa * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.1e1 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.sin(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) + 0.8e1 * Math.sin(0.5000000000e0 * lambda * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) * (((tau * kappa * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1) - 0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.5000000000e0 * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) - 0.5000000000e0 * tau * ((0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1))) * kappa * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)) + 0.5000000000e0 * ((0.2e1 * tau * (0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1)) * kappa * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.1e1 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) + tau * kappa * ((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.1e1 * (0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.sin(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)))) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) + (((-0.4e1 * tau * kappa * ((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.1e1 * (0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) + 0.8e1 * ((0.5000000000e0 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + 0.5000000000e0 * Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1))) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + tau * kappa * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1) - 0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)) - 0.4e1 * (tau * ((0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1))) * kappa * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) + ((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.1e1 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.2e1 * tau * (0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1)) * kappa * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.sin(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) + 0.4e1 * Math.sin(0.5000000000e0 * lambda * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) * ((((-0.1e1 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.1e1 * Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1))) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.2e1 * tau * kappa * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1) - 0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) - 0.1e1 * tau * kappa * ((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.1e1 * (0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))) * Math.cos(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)) + Math.sin(0.5000000000e0 * lambda * kappa * (k1 + 0.2e1 * k2)) * (((Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (Math.pow(kappa, 0.4e1) + Math.pow(tau, 0.4e1)) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.1e1 * tau * (kappa * kappa + tau * tau) * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) - 0.2e1 * tau * (0.5000000000e0 * (kappa * kappa + tau * tau) * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * tau * kappa * Math.cos(0.5000000000e0 * lambda * k1)) * kappa * Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1))) * Math.cos(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2)) - 0.1e1 * tau * ((0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.cos(0.5000000000e0 * lambda * kappa * k1) + Math.sin(0.5000000000e0 * lambda * k1) * Math.sin(0.5000000000e0 * lambda * kappa * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau)) * Math.cos(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) + Math.sin(0.5000000000e0 * lambda * kappa * (-0.2e1 + k1)) * (Math.sin(0.5000000000e0 * lambda * k1) * Math.cos(0.5000000000e0 * lambda * k1) * (kappa * kappa + tau * tau) * Math.cos(0.5000000000e0 * lambda * kappa * k1) - 0.2e1 * tau * kappa * (Math.pow(Math.cos(0.5000000000e0 * lambda * k1), 0.2e1) - 0.5000000000e0) * Math.sin(0.5000000000e0 * lambda * kappa * k1))) * kappa * Math.sin(0.5000000000e0 * lambda * (k1 + 0.2e1 * k2))))) * Math.sin(0.5000000000e0 * lambda * kappa * (-0.1e1 * k1 + 0.2e1 * k2 + 0.2e1 * k)) + 0.4e1 * Math.cos(xi) * kappa * kappa * tau * tau;
    }
}
