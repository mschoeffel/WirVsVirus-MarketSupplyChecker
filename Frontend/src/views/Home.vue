<template>
  <layout-default>
    
  <div class="home" :style="{'background-image': 'url(' + require('../assets/background.jpg') + ')', 'height': '100%', 'background-size': 'cover'}">
    <HomeComp/>
  </div>
  </layout-default>
</template>

<script>
// @ is an alias to /src
import HomeComp from '@/components/HomeComp.vue'
import LayoutDefault from "../layouts/LayoutDefault";

export default {
  name: 'Home',
  components: {
    LayoutDefault,
    HomeComp
  }
}
</script>
