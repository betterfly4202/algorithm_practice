package com.solid.interfaceSegeregation;

/**
 *  https://en.wikipedia.org/wiki/Interface_segregation_principle
 *
 *  클라이언트는 사용하지 않는 메서드들에 의존하지 않아야 한다.
 *  큰 인터페이스들을 더 작은 단위로 분리 시키는 것이 좋다.
 *
 *  예를들어 여기 수륙양용차(보트+자동차)가 interface가 있다.
 *  그리고 이를 구현하는 자동차{@link Genesis}, 보트{@link Cruise}, 수륙양용차{@link LandWaterCar} 세가지 클래스가 있다.
 *
 *  ICarBoat에선 자동차 + 보트 기능을 모두 총괄하고 있지만,
 *  자동차 클래스에서는 보트 기능을, 보트 클래스에서는 자동차 기능을 사용하지 않으며 불필요한 코드만 나열하게 된다.
 *
 *  즉 interface segregation 원칙에서 말하고자 하는 것은,
 *  이렇게 큰 단위로 인터페이스를 가져가는 것이 아닌 역할을 분리하여 작은 단위로 인터페이스를 설계하는 방식을 말한다.
 *
 */
public interface ICarBoat {
    /*
        자동차 기능
     */
    void drive();
    void turnLeft();
    void turnRight();
    void klaxon();

    /*
        보트 기능
     */
    void steer();
    void steerLeft();
    void steerRight();
}
