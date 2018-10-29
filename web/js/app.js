const app = new Vue({
    el: '#app',
    methods: {
        /**
         * Solicitar informacion al servidor
         */
        getData: function() {
            // Guardar la instancia a una variable
            var self = this;
            axios.get("/users")
                .then(function (response) {
                    // cargar datos al arreglo de users (usando la variable local creada
                    self.users = response.data.data;
                })
                .catch(function (errors) {
                    // Si algo salio mal
                    console.log(errors);
                    alert('Error al optener la informacion');
                });
        },
        store: function () {
            // Guardar la instancia a una variable
            var self = this;
            axios.post("/users", self.form)
                .then(function (response) {

                    if (self.users.length) {
                        // Si el arreglo ya contiene datos
                        self.users.push(response.data.data);
                    } else {
                        // si el arreglo es vacio
                        self.users = [response.data.data];
                    }
                    // Limpiar formulario
                    self.form = {
                        name: "",
                        lastName: "",
                        age: 0
                    };
                    alert("Datos agregados a la table :)");
                })
                .catch(function (errors) {
                    console.log(errors);
                    // si algo salio mal
                    alert("Error inesperado");
                });
        }
    },
    data: function() {
        // Variables que contienen informacion
        return {
            message: "Hola :3",
            formMessage: "Agregar desde formulario",
            users: [],
            form: {
                name: "",
                lastName: "",
                age: 0
            }
        }
    }
});