package api.lambda;

@FunctionalInterface
interface Convertor<F, T> {
    T convert(F func);
}