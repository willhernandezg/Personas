package me.willhernandezg.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ResourceCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cajaCedula,cajaNombre,cajaApellido;
    private Resources res;
    private Spinner cajaSexo;
    private String [] sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cajaCedula = (EditText)findViewById(R.id.txtCedula);
        cajaNombre= (EditText)findViewById(R.id.txtNombre);
        cajaApellido= (EditText)findViewById(R.id.txtApellido);
        cajaSexo = (Spinner)findViewById(R.id.cmbSexo);
        res = this.getResources();

        sexo = res.getStringArray(R.array.sexo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sexo);
        cajaSexo.setAdapter(adapter);
    }

    public void guardar(View v){
        String cedula,nombre,apellido;
        int sex;
        cedula = cajaCedula.getText().toString();
        nombre = cajaNombre.getText().toString();
        apellido = cajaApellido.getText().toString();
        sex = cajaSexo.getSelectedItemPosition();
        Persona p = new Persona(cedula,nombre,apellido,sex);
        p.guardar();

        Toast.makeText(this,res.getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        limpiar();
    }

    private void limpiar(){
        cajaCedula.setText("");
        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaSexo.setSelection(0);
        cajaCedula.requestFocus();
    }
}
