class Solution {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    if (map.get(a).equals(map.get(b)))
                        return b - a;
                    return map.get(a) - map.get(b);
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}