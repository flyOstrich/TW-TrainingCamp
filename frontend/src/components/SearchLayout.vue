<template>
  <div class="search-layout">
    <div class="search-bar">
      <slot name="search-bar" :data="data"></slot>
    </div>
    <div class="search-result">
      <div
        class="summary-card"
        v-for="dataItem in data"
        :key="dataItem[repeatkey]"
        @click="$emit('item-click', dataItem)"
      >
        <summary-card :thumbnail="dataItem[thumbnailProp]">
          <slot name="summary" :data="dataItem"></slot>
        </summary-card>
        <slot name="footer" :data="data"></slot>
      </div>
    </div>
  </div>
</template>
<script>
import SummaryCard from "@/components/SummaryCard.vue";
export default {
  components: { SummaryCard },
  props: {
    data: Array,
    repeatkey: String,
    thumbnailProp: String
  }
};
</script>
<style lang="less">
.search-layout {
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  width: 100%;
  background: white;
  .search-bar {
    position: absolute;
    left: 0;
    z-index: 100;
    background: white;
    padding: 20px 0 0 0;
    width: 100%;
    text-align: center;
  }
  .search-result {
    height: 90%;
    margin: 70px 0 0 70px;
    padding-bottom: 80px;
    display: flex;
    display: -webkit-flex;
    justify-content: flex-start;
    -webkit-justify-content: flex-start;
    flex-wrap: wrap;
    overflow: auto;
    .summary-card {
      margin: 10px;
    }
  }
}
</style>
