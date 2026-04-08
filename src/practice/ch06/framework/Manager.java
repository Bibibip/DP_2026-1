package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

// Product를 등록하고, 필요할 때 Product를 복제해서 리턴하는 클래스
public class Manager {  // 관리하는 객체는 Product(interface)
    // Product: 부모 타입(Product를 구현한 모든 것을 다 관리할 수 있음)
    private Map<String,Product> showcase = new HashMap<String,Product>(); // (key, value) 쌍으로 저장하는 Map
                                                        //원래 여기 괄호에도 적어야 하는데 같은 내용이니 생략해도 됨 <>
    
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);  // (key, value) 쌍으로 해시MAP에 저장
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);    // (key)에 해당하는 value를 반환(해시MAP에서 꺼내기)
        return p.createCopy();  // 꺼낸 Product를 복제해서 리턴
    }
}
