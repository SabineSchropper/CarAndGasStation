package com.company;

public class DistanceCalculator {
    public static int getDistance(Cities start, Cities end) {
        int distance = 0;
        switch (start) {
            case BLUDENZ: {
                switch (end) {
                    case BREGENZ:
                        distance = 40;
                        break;
                    case GOETZIS:
                        distance = 30;
                        break;
                    case FELDKIRCH:
                        distance = 25;
                        break;
                    case DORNBIRN:
                        distance = 35;
                        break;
                    case HOHENEMS:
                        distance = 33;
                        break;
                    default:
                        System.out.println("An error occured.");
                        break;
                }
            }
            break;
            case FELDKIRCH: {
                switch (end) {
                    case BREGENZ:
                        distance = 28;
                        break;
                    case GOETZIS:
                        distance = 15;
                        break;
                    case DORNBIRN:
                        distance = 25;
                        break;
                    case HOHENEMS:
                        distance = 18;
                        break;
                    case BLUDENZ:
                        distance = 25;
                        break;
                    default:
                        System.out.println("An error occured.");
                        break;

                }
            }
            break;
            case HOHENEMS: {
                switch (end) {
                    case BREGENZ:
                        distance = 18;
                        break;
                    case GOETZIS:
                        distance = 10;
                        break;
                    case DORNBIRN:
                        distance = 13;
                        break;
                    case BLUDENZ:
                        distance = 28;
                        break;
                    default:
                        System.out.println("An error occured.");
                        break;

                }
            }
            break;
            default:
                System.out.println("An error occured.");
        }

        return distance;
    }
}
