package practice.ch04.framework;

public abstract class Factory {
    // 템플릿 메소드
    // 제품을 생산하는 방식을 정의하는 메소드
    public final Product create(String owner) {
        Product p = createProduct(owner);   // 실제 제품을 생산
        // 자식이 구현하기 때문에 어떤 제품이 생산될지는 모름! -> Product로 반환 받음
        registerProduct(p); // 생산된 제품을 등록
        return p;
    }
    // 어떤 제품을 생산할지는 자식에서 결정
    //팩토리 메소드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
