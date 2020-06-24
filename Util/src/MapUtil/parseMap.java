package MapUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: nc
 * @description： 主要处理过滤条件Map对象，过滤掉了null和空字符串 等操作
 */

public class parseMap {

    public static void main(String[] args) {
        Map<String , Object> map = new HashMap<>();
        map.put("一班",20);
        map.put("二班","");
        map.put("三班",30);
        map.put("四班",null);
        map.put("","");

       // map = parseMapForFilter(map);
        map = parseMapFilterByOptional(map);

        System.out.println(map);
        System.out.println(parseMapFilterByOptional(null));




    }


    public static Map<String , Object> parseMapForFilter(Map<String , Object> map) {
        if (map == null) {
            return null;
        } else {
            map = map.entrySet().stream()
                    .filter(e -> checkValue(e.getValue()))
                    .collect(Collectors.toMap(
                            e -> e.getKey(),
                            e -> e.getValue()
                    ));
        }
        return map;
    }

    private static boolean checkValue(Object value) {
        if (value instanceof String && "".equals(value)) {
            return  false;
        }
        if (null == value) {
            return false;
        }

        return  true;
    }

    public static Map<String , Object> parseMapFilterByOptional(Map<String , Object> map) {
        return Optional.ofNullable(map).map(
                e -> {
                    Map prase = e.entrySet().stream()
                            .filter(v -> checkValue(v.getValue()))
                            .collect(Collectors.toMap(
                                    v -> v.getKey(),
                                    v -> v.getValue()
                            ));
                    return  prase;
                }
        ).orElse(null);

    }


}
