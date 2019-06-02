<template>
  <div class="apply">
    <el-divider content-position="center">语文</el-divider>
    <div
      class="desc"
    >王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎王小虎</div>
    <div class="apply-btn">
      <el-button type="primary" @click="applyClick">报名</el-button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      id: null
    };
  },
  methods: {
    applyClick() {
      this.$router.push({ path: `/task/${this.$route.params.id}` });
    }
  }
};
</script>

<style scoped lang="less">
.apply {
  margin-top: 50px;
  padding: 15px;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  .desc {
    text-indent: 2em;
    line-height: 40px;
  }
  .apply-btn {
    margin: 15px auto;
    text-align: center;
  }
}
</style>
