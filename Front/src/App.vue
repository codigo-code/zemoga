<template>
  <!--img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/-->

  <Profile />
  <div class="timeline">
    <TimeLine />
  </div>
</template>

<script>

// import HelloWorld from './components/HelloWorld.vue'
import Profile from "./components/Profile.vue";
import TimeLine from "./components/TimeLine.vue";


export default {
  name: "App",
  components: {
    // HelloWorld,
    Profile,
    TimeLine,
 
  },
  data() {
    return {
      show: true,
      label: "Loading...",
      overlay: true,
    };
  },
  service: {},
};
</script>

<style>
body {
  background-color: lightgray;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.timeline {
  /* margin-left: -26em; */
  /* margin-top: 11em; */
  position: absolute;
  margin-left: 4em;
  margin-top: 4em;
}
</style>
