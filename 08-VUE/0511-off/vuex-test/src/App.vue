<template>
  <div id="app">
    <div id="nav">
      <router-link to="/step00">step00</router-link> |
      <router-link to="/step01">step01</router-link> |
      <router-link to="/step02">step02</router-link> |
      <router-link to="/step03">step03</router-link> |
      <router-link to="/step04">step04</router-link> |
      <router-link to="/step05">step05</router-link> |
      <router-link to="/step06">step06</router-link> |
      <router-link to="/step07">step07</router-link>
    </div>
    <router-view />
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
