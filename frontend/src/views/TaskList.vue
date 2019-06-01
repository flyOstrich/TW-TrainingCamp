<template>
  <div class="apply">
    <el-divider content-position="center">{{ id }}任务列表</el-divider>
    <div class="desc">
      <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="date" header-align="left" align="left" label="任务"></el-table-column>
        <el-table-column prop="name" header-align="left" label="内容"></el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    this.id = this.$route.params.id;
  },
  data() {
    return {
      id: null,
      tableData: [
        {
          date: "2016-05-02",
          name: "王小虎"
        },
        {
          date: "2016-05-04",
          name: "王小虎"
        },
        {
          date: "2016-05-01",
          name: "王小虎"
        },
        {
          date: "2016-05-03",
          name: "王小虎"
        }
      ]
    };
  }
};
</script>

<style scoped lang="less">
.apply {
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
  div {
    text-indent: 0;
  }
}
</style>
