public class Tareas{
    public String[] tareas = new String[] {"Estudiar","Recoger"};
    public void imprimirTareas(){
        System.out.println("Tareas: ");
        for (int i=0;i< tareas.length;i++){
            System.out.println("Tarea "+(i+1)+": "+tareas[i]);
        }
    }
    public void agregarTarea(String tarea){
        String[] nuevoArray = new String[tareas.length + 1];

        // Copiar las tareas existentes
        for (int i = 0; i < tareas.length; i++) {
            nuevoArray[i] = tareas[i];
        }

        // Añadir la nueva tarea al final
        nuevoArray[tareas.length] = tarea;

        // Reemplazar el array original
        tareas = nuevoArray;
    }

}