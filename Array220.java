public boolean array220(int[] nums, int index) {
  if(nums.length -1 == index || nums.length == 0) {
    return false;
  }
  if(nums[index]*10 == nums[index+1]) {
    return true;
  }
  return array220(nums, index+1);
}
