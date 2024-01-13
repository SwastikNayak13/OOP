using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace NotePad
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void richTextBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void formatToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
                OpenFileDialog dlg = new OpenFileDialog();
                dlg.Title = "Open";
                dlg.ShowDialog();
                string fName = dlg.FileName;
                StreamReader sr = new StreamReader(fName);
                richTextBox1.Text = sr.ReadToEnd();
                sr.Close();
            
        }

        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {
            saveFileDialog1.ShowDialog();
            string fName = saveFileDialog1.FileName;
            StreamWriter sw = new StreamWriter(fName);
            sw.Write(richTextBox1.Text);
            sw.Flush();
            sw.Close();
        }
        private void fontToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FontDialog fd = new FontDialog();
            fd.Font = richTextBox1.SelectionFont;
            fd.Color = richTextBox1.SelectionColor;
            if (fd.ShowDialog() == DialogResult.OK)
            {
                richTextBox1.SelectionFont = fd.Font;
                richTextBox1.SelectionColor = fd.Color;
            }
        }

        private void aboutUsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Demo notepad hehe","AboutUs");
        }

        private void button1_Click(object sender, EventArgs e)
        {

            Form4 frm = new Form4();
            frm.Show();
        }

        private void colorToolStripMenuItem_Click(object sender, EventArgs e)
        {
           
        }

        private void textColorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var res = colorDialog1.ShowDialog();
            if (res == DialogResult.OK)
            { richTextBox1.ForeColor = colorDialog1.Color; }
        }

        private void backColorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var res = colorDialog1.ShowDialog();
            if (res == DialogResult.OK)
            { richTextBox1.BackColor = colorDialog1.Color; }
        }

        private void fontToolStripMenuItem_Click_1(object sender, EventArgs e)
        {
            fontDialog1.ShowColor = true;

            fontDialog1.Font = richTextBox1.Font;
            fontDialog1.Color = richTextBox1.ForeColor;

            if (fontDialog1.ShowDialog() != DialogResult.Cancel)
            {
                richTextBox1.Font = fontDialog1.Font;
                richTextBox1.ForeColor = fontDialog1.Color;
            }
        }

        
    }
}
