<template>
  <el-card :body-style="{ padding: '0px' }">
    {{thumbnail}}
    <img :src="thumbnail" class="image">
    <div class="summary">
      <slot></slot>
    </div>
  </el-card>
</template>
<script>
export default {
  props: {
    thumbnail: String
  }
};
</script>
<style lang="less">
.el-card {
  display: inline-block;
  .summary {
    padding: 5px;
    text-align: left;
  }
}
</style>
