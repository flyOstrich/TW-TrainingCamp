import { shallowMount } from '@vue/test-utils'
import Apply from '../Apply'
const $route = {
  path: '/apply',
  params: {
    id: 1
  }
}


describe("HelloWorld.vue", () => {
  it("renders props.msg when passed", () => {
    const wrapper = shallowMount(Apply, {
      mocks: {
        $route
      }
    })
    expect(wrapper.vm.$route.params.id).toBe(1)
  });
});
