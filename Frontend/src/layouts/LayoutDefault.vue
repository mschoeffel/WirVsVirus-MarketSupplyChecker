<template>
    <v-app id="inspire">
        <v-navigation-drawer
                v-model="drawer"
                :clipped="$vuetify.breakpoint.lgAndUp"
                app
        >
            <v-list dense>
                <v-list-item link v-on:click="routeSearch">
                    <v-list-item-action>
                        <v-icon>mdi-magnify</v-icon>
                    </v-list-item-action>
                    <v-list-item-content>
                        <v-list-item-title>Produkt suchen</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>
                <v-list-item link v-on:click="routeAddInfo">
                    <v-list-item-action>
                        <v-icon>mdi-plus</v-icon>
                    </v-list-item-action>
                    <v-list-item-content>
                        <v-list-item-title>Produkt eintragen</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>
                <v-list-item link v-on:click="routeSoGehts">
                    <v-list-item-action>
                        <v-icon>mdi-lightbulb-on-outline</v-icon>
                    </v-list-item-action>
                    <v-list-item-content>
                        <v-list-item-title>So geht's</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>
            </v-list>
            <template v-slot:append>
                <v-list>
                    <v-list-item link v-on:click="routeWirVsVirus">
                        <v-list-item-action>
                            <v-icon>mdi-account-group</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <v-list-item-title>#WirVsVirus</v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                    <v-list-item link v-on:click="routeGithub">
                        <v-list-item-action>
                            <v-icon>mdi-github</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <v-list-item-title>Github</v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                </v-list>
            </template>
        </v-navigation-drawer>

        <v-app-bar :clipped-left="$vuetify.breakpoint.lgAndUp" app>
            <v-app-bar-nav-icon @click.stop="drawer = !drawer"/>
            <v-btn icon large v-on:click="routeHome">
                <v-avatar size="32px" item>
                    <v-img :src="require('../assets/logo_small.jpg')" alt="WarenRadar"/>
                </v-avatar>
            </v-btn>
            <v-toolbar-title v-on:click="routeHome" style="width: 300px; cursor: pointer" class="ml-0 pl-4">
                <span class="hidden-sm-and-down">WarenRadar</span>
            </v-toolbar-title>
            <v-spacer/>
            <v-chip color="error">
                <v-avatar left>
                    <v-icon>mdi-alert</v-icon>
                </v-avatar>
                Beta - gemockte Funktionalität!
            </v-chip>
            <v-spacer></v-spacer>
            <v-btn v-on:click="routeSoGehts" class="v-btn">So Geht's</v-btn>
        </v-app-bar>
        <v-content>
            <slot/>
        </v-content>
    </v-app>
</template>

<script>

    export default {
        props: {
            source: String,
        },
        data: () => ({
            dialog: false,
            drawer: null,
        }),
        components: {},
        methods: {
            routeSoGehts: function () {
                this.$router.push({path: "/manual"});
            },
            routeHome: function () {
                this.$router.push({path: "/"});
            },
            routeSearch: function () {
                this.$router.push({path: "/search"});
            },
            routeAddInfo: function () {
                this.$router.push({path: "/addInfo"});
            },
            routeGithub: function() {
                window.location = "https://github.com/mschoeffel/WirVsVirus-MarketSupplyChecker";
            },
            routeWirVsVirus: function() {
                window.location = "https://wirvsvirushackathon.org/";
            },
        }
    }
</script>