package quizful.quiz3;

/**
 * Можно ли унаследовать от класса B абстрактный класс?
 * Если да, то что нужно сделать с методом print(): его обязательно надо переопределить,
 * его можно не переопределять, можно ли его определить как abstract?
 */
abstract class Quiz3 {
    public abstract void print();
}

class B extends Quiz3 {
    public void print() {
        System.out.println("B");
    }
}

//--//--//--//--//--//

/**
 * От класса B можно унаследовать абстрактный класс(к примеру, класс C),
 * при этом метод print() можно не переопределять, так как его реализация есть в классе B.
 */
abstract class C extends B {
}

abstract class D extends B {
    @Override
    public void print() {
        System.out.println("D");
    }
}

/**
 * или сделать абстрактным (тогда наследники от класса C обязаны будут предоставить
 * реализацию метода print() или также являться абстрактными).
 */
abstract class E extends B {
    public abstract void print();
}

class F extends E {
    public void print() {
        System.out.println("D");
    }
}