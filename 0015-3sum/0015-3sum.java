class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> pos = new HashMap<>();
        Map<Integer, Integer> neg = new HashMap<>();
        int zeroCount = 0;

        // Populate the maps
        for (int num : nums) {
            if (num > 0) {
                pos.put(num, pos.getOrDefault(num, 0) + 1);
            } else if (num < 0) {
                neg.put(num, neg.getOrDefault(num, 0) + 1);
            } else {
                zeroCount++;
            }
        }

        // Check for the triplet (0, 0, 0)
        if (zeroCount >= 3) {
            result.add(Arrays.asList(0, 0, 0));
        }

        Set<List<Integer>> resultSet = new HashSet<>();
        List<Integer> triplet;
        // Check for other combinations
        for (Map.Entry<Integer, Integer> elePos : pos.entrySet()) {
            int posVal = elePos.getKey();
            for (Map.Entry<Integer, Integer> eleNeg : neg.entrySet()) {
                int negVal = eleNeg.getKey();
                int rem = -(posVal + negVal);

                if (rem == 0 && zeroCount > 0) {
                    resultSet.add(Arrays.asList(posVal, negVal, 0));
                } else if (rem > 0 && pos.containsKey(rem)) {
                    if ((rem == posVal && pos.get(rem) > 1) || rem != posVal) {
                        triplet = Arrays.asList(posVal, negVal, rem);
                        Collections.sort(triplet);
                        resultSet.add(triplet);
                    }
                } else if (rem < 0 && neg.containsKey(rem)) {
                    if ((rem == negVal && neg.get(rem) > 1) || rem != negVal) {
                        triplet = Arrays.asList(posVal, negVal, rem);
                        Collections.sort(triplet);
                        resultSet.add(triplet);
                    }
                }
            }
        }
        
        result.addAll(resultSet);
        return result;
    }
}