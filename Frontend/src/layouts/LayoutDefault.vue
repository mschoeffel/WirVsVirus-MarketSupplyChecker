<template>
    <v-app id="inspire">
        <v-navigation-drawer
                v-model="drawer"
                :clipped="$vuetify.breakpoint.lgAndUp"
                app
        >
            <v-list dense>
                <template v-for="item in items">
                    <v-row
                            v-if="item.heading"
                            :key="item.heading"
                            align="center"
                    >
                        <v-col cols="6">
                            <v-subheader v-if="item.heading">
                                {{ item.heading }}
                            </v-subheader>
                        </v-col>
                        <v-col
                                cols="6"
                                class="text-center"
                        >
                            <a
                                    href="#!"
                                    class="body-2 black--text"
                            >EDIT</a>
                        </v-col>
                    </v-row>
                    <v-list-group
                            v-else-if="item.children"
                            :key="item.text"
                            v-model="item.model"
                            :prepend-icon="item.model ? item.icon : item['icon-alt']"
                            append-icon=""
                    >
                        <template v-slot:activator>
                            <v-list-item-content>
                                <v-list-item-title>
                                    {{ item.text }}
                                </v-list-item-title>
                            </v-list-item-content>
                        </template>
                        <v-list-item
                                v-for="(child, i) in item.children"
                                :key="i"
                                link
                        >
                            <v-list-item-action v-if="child.icon">
                                <v-icon>{{ child.icon }}</v-icon>
                            </v-list-item-action>
                            <v-list-item-content>
                                <v-list-item-title>
                                    {{ child.text }}
                                </v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>
                    </v-list-group>
                    <v-list-item
                            v-else
                            :key="item.text"
                            link
                    >
                        <v-list-item-action>
                            <v-icon>{{ item.icon }}</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <v-list-item-title>
                                {{ item.text }}
                            </v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                </template>
            </v-list>
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
            items: [
                {icon: 'mdi-magnify', text: 'Produkt suchen'},
                {icon: 'mdi-plus', text: 'Produkt eintragen'},
                {icon: 'mdi-lightbulb-on-outline', text: 'So geht\'s'},
                {icon: 'mdi-account-group', text: '#WirVsVirus'},
                {icon: 'mdi-github', text: 'Github'}
            ],
        }),
        components: {},
        methods: {
            routeSoGehts: function () {
                this.$router.push({path: "/manual"});
            },
            routeHome: function () {
                this.$router.push({path: "/"});
            }
        }
    }
</script>