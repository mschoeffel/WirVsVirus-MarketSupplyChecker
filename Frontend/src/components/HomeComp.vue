<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img
          :src="require('../assets/logo_wvv.png')"
          class="my-3"
          contain
          height="200"
        />
      </v-col>

      <v-col class="mb-4">
        <h1 class="display-2 font-weight-bold mb-3">
          Herzlich Willkommen bei WarenRadar,
          <br>schön, dass du uns hilfst.
        </h1>

        <p class="subheading font-weight-regular">
          WarenRadar hilft dir dabei den Supermarkt zu finden der deine Bedürfnisse am bestern erfüllt.
        </p>
      </v-col>

      <v-col
        class="mb-5"
        cols="12"
      >
        <v-row justify="center">
          <v-btn v-on:click="routeSearch" rounded color="primary" dark x-large>Produkt<br>suchen</v-btn>
          <v-btn v-on:click="routeAdd" rounded color="secondary" dark x-large>Produkt<br>Eintragen</v-btn>
        </v-row>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
  export default {
    name: 'HomeComp',
    data: () => ({
    }),
    methods: {
      routeSearch: function () {
        this.$router.push({ path: "/search" });
      },
      routeAdd: function () {
        this.$router.push({ path: "/addInfo" });
      }
    }
  }
</script>
